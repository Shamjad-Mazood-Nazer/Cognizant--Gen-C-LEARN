create view Customer_Policies as
select c.id,
    c.first_name,
    c.phone_number,
    count(p.id) as policy_count,
    sum(c1.amount_of_claim) as amount_claimed
from customer c
    join customer_policy p on c.id = p.customer_id
    join claims c1 on p.id = c1.customer_policy_id
group by c.id,
    c.first_name,
    c.phone_number;

go