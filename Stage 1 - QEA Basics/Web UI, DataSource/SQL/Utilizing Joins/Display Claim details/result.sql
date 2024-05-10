select c1.id,
    c1.date_of_claim,
    c1.amount_of_claim
from claims c1
    join status s1 on c1.status_id = s1.id
where s1.description = 'Inprogress';

go