select first_name
from customer c1
    join customer_policy c2 on c2.customer_id = c1.id
group by c1.first_name
having count(customer_id) = (
        select max(c_count)
        from (
                select count(customer_id) as c_count
                from customer_policy
                group by customer_id
            ) aa
    )
union
select first_name
from customer c1
    full join customer_policy c2 on c1.id = customer_id
group by first_name
having count(customer_id) = 0

go