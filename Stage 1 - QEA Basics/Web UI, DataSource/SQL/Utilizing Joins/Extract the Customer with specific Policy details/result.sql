SELECT customer.id,
    first_name,
    policy_start_date,
    policy_renewal_date,
    premium_amount,
    policy_value
FROM customer
    join customer_policy on customer.id = customer_policy.customer_id
    join policy on customer_policy.policy_id = policy.id
where policy.name = 'Medical Insurance'
    or policy.name = 'Vehicle Insurance'
order by customer.id;

go