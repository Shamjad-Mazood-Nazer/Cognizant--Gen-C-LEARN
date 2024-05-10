CREATE function Find_customer_detail(@customer_id INT)
RETURNS VARCHAR(200)
AS
BEGIN
    DECLARE @result VARCHAR(100)
    select
    @result = first_name + ' ' + last_name + ' ' + phone_number
    from customer
    where id = @customer_id
    if @result is null
    set @result = 'Customer Not Available'
    RETURN @result
END;

go