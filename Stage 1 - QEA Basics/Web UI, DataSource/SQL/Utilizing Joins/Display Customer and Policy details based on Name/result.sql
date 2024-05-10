SELECT p1.name
FROM policy p1
    JOIN customer_policy cp1 ON cp1.policy_id = p1.id
    JOIN customer c1 ON c1.id = cp1.customer_id
WHERE c1.first_name = 'Meena'
    AND c1.last_name = 'Chowdhury'
ORDER BY p1.name;

Go