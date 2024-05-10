select count(claims.id) number_of_claims
from claims
    join status on claims.status_id = status.id
where description = "Completed"
union all
select count(claims.id) number_of_claims
from claims
    join status on claims.status_id = status.id
where description = "Pending"

go