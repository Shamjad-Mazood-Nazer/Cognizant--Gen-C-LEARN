SELECT count(address.city) customer_count
FROM address
    JOIN (
        SELECT *
        FROM customer
        WHERE phone_number like '7%'
            or phone_number like '8%'
    ) as t ON t.address_id = address.id
WHERE address.city = "Bangalore"
GROUP BY address.city;

go