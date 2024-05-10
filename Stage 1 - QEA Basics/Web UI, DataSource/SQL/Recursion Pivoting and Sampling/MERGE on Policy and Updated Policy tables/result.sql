MERGE INTO updated_policy AS target USING policy AS source ON (target.id = source.id)
WHEN MATCHED
AND target.name <> source.name THEN
UPDATE
SET target.name = source.name
    WHEN NOT MATCHED BY source THEN DELETE OUTPUT $action as '$action',
    deleted.id as Targetid,
    deleted.name as Targetname,
    deleted.description as Targetdescription,
    deleted.insurance_company_id as Targetinsurance_company_id,
    source.id as Sourceid,
    source.name as Sourcename,
    source.description as Sourcedescription,
    source.insurance_company_id as Sourceinsurance_company_id;

GO