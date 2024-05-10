select c1.first_name
from customer c1
    join customer_policy cp on cp.customer_id = c1.id
    join claims c2 on c2.customer_policy_id = cp.id
where amount_of_claim = (
        SELECT MAX(amount_of_claim)
        FROM claims
    );

GO