# Write your MySQL query statement below

# SELECT eu.unique_id as unique_id , e.Employees as name FROM EmployeeUNI e LEFT JOIN Employees eu on e.id = eu.id;

# select 
# eu.unique_id as unique_id, e.name as name
# from Employees e left join EmployeeUNI eu on e.id = eu.id

Select eu.unique_id, e.name 
from Employees e left join EmployeeUNI eu
on e.id = eu.id;