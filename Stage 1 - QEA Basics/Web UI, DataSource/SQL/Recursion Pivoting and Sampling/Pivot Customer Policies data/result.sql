select 'customerCount' as customer_count,
    [250000],
    [75000],
    [45000]
from (
        select policy_value,
            customer_id
        from customer_policy
    ) as SourceTable PIVOT (
        count(customer_id) for policy_value IN ([250000], [75000], [45000])
    ) as PivotTable;

go