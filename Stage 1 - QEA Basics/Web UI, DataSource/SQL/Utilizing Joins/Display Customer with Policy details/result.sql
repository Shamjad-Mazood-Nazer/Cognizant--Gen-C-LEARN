select c1.id,
    c1.first_name,
    c2.policy_start_date,
    c2.policy_renewal_date,
    c2.premium_amount,
    c2.policy_value
from customer_policy c2,
    customer c1
where c1.id = c2.customer_id
order by c1.first_name asc

go