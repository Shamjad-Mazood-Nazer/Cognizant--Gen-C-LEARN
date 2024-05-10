SELECT name,
    ISNULL([2000], 0) AS '2000',
    ISNULL([2001], 0) AS '2001',
    ISNULL([2004], 0) AS '2004',
    ISNULL([2005], 0) AS '2005',
    ISNULL([2006], 0) AS '2006',
    ISNULL([2008], 0) AS '2008',
    ISNULL([2010], 0) AS '2010',
    ISNULL([2012], 0) AS '2012',
    ISNULL([2015], 0) AS '2015'
FROM (
        SELECT p.name AS name,
            CASE
                WHEN Year(cp.policy_start_date) IN (
                    2000,
                    2001,
                    2004,
                    2005,
                    2006,
                    2008,
                    2010,
                    2012,
                    2015
                ) THEN YEAR(cp.policy_start_date)
                ELSE NULL
            END AS Year
        FROM customer_policy cp
            JOIN policy p ON CP.policy_id = p.id
    ) AS SourceTable PIVOT (
        COUNT(Year) FOR Year IN (
            [2000],
            [2001],
            [2004],
            [2005],
            [2006],
            [2008],
            [2010],
            [2012],
            [2015]
        )
    ) AS PivotTable;

GO