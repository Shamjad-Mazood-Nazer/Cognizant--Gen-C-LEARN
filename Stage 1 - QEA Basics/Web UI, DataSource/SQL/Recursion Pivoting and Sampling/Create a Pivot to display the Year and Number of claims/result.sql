select year,
    isnull([1], 0) as JANUARY,
    isnull([2], 0) as FEBRUARY,
    isnull([3], 0) as MARCH,
    isnull([4], 0) as APRIL,
    isnull([5], 0) as MAY,
    isnull([6], 0) as JUNE,
    isnull([7], 0) as JULY,
    isnull([8], 0) as AUGUST,
    isnull([9], 0) as SEPTEMBER,
    isnull([10], 0) as OCTOBER,
    isnull([11], 0) as NOVEMBER,
    isnull([12], 0) as DECEMBER
from (
        select year(date_of_claim) as year,
            month(date_of_claim) as Month,
            count(*) as NumberOfClaims
        from claims
        group by Year(date_of_claim),
            Month(date_of_claim)
    ) as SourceTable PIVOT (
        sum(NumberOfClaims) for Month IN (
            [1],
            [2],
            [3],
            [4],
            [5],
            [6],
            [7],
            [8],
            [9],
            [10],
            [11],
            [12]
        )
    ) as PivotTable;

GO