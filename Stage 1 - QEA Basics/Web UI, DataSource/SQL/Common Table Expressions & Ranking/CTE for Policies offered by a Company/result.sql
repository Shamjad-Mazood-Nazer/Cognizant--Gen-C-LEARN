select insurance_company.name insurance_company_name
from insurance_company
    join policy on insurance_company.id = policy.insurance_company_id
group by insurance_company.name
having count(policy.id) > 1

go