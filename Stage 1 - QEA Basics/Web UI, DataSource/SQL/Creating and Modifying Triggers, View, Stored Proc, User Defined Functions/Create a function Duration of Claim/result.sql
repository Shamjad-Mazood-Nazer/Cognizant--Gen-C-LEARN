create function duration_of_claim (@claim_id INT, @policy_id INT) returns varchar(200) as begin
declare @result varchar(200)
select @result = (
        c.first_name + ' has phone_number of ' + c.phone_number + ' and his/her claim duration is' + cast(
            DATEDIFF(year, c1.date_of_claim, cp.policy_start_date) as varchar
        ) + ' years and claimed amount is ' + cast((c1.amount_of_claim) as varchar)
    )
from customer c
    join customer_policy cp on cp.customer_id = c.id
    join claims c1 on c1.customer_policy_id = cp.id
where c1.id = @claim_id
    and cp.policy_id = @policy_id;
return @result;
end;

go