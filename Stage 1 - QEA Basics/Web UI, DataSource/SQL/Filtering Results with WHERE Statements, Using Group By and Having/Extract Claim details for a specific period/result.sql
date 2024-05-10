SELECT id,
    amount_of_claim
FROM claims
WHERE date_of_claim BETWEEN '2008-01-10' AND '2010-03-30'
    AND amount_of_claim > 200000
ORDER BY id ASC;

go