select first_name as customer_name,
    sum(amount_of_claim) claim_amount,
    rank() over(
        order by sum(amount_of_claim) desc
    ) as rank
from customer c1
    join customer_policy c2 on c1.id = c2.customer_id
    join claims c3 on c3.customer_policy_id = c2.id
group by first_name
order by rank

Go