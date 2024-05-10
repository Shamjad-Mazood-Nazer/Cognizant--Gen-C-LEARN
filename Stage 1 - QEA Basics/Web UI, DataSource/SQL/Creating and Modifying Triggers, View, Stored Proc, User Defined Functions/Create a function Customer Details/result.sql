CREATE FUNCTION customer_details() returns TABLE AS return(
    SELECT *
    FROM customer
);

GO