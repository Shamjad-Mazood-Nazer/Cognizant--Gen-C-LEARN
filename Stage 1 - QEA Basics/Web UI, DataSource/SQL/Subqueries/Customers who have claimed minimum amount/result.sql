select first_name
from customer c1
    join customer_policy c2 on c1.id = c2.customer_id
    join claims c3 on c2.id = c3.customer_policy_id
where amount_of_claim = (
        select min(amount_of_claim)
        from claims
    );

go