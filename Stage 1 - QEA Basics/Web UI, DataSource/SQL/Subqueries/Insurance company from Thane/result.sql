select i1.id,
    name
from insurance_company i1
    join address a1 on i1.address_id = a1.id
where a1.city = (
        select city
        from address
        where city = 'Thane'
    )
order by name asc

go