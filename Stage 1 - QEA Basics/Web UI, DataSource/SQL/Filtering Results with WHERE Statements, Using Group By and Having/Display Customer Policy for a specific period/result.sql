select id,
    premium_amount,
    policy_value
from customer_policy
where policy_renewal_date > '31-DEC-2013'
    and policy_renewal_date < '01-JAN-2015'
    and policy_value > 20000
order by id asc;

GO