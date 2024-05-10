create PROCEDURE
noofyears(@premium_amt INT, @claim_amount INT)
as
begin
    declare @no_of_years INT;
    declare @success_msg VARCHAR(200);
    declare @error_msg VARCHAR(200) = 'Premium amount is 0';
    
    if @premium_amt > 200
    begin
        set @no_of_years = @claim_amount / (@premium_amt * 12);
        set @success_msg = 'Customer has to pay '+cast(@premium_amt as VARCHAR) + ' for '+cast(@no_of_years as VARCHAR)+' years';
        insert into success_log
        (success_msg) values (@success_msg);
    end
    else if @premium_amt = 200
    begin
        insert into premium_error_log(error_msg) values (@error_msg);
    end
end;

go