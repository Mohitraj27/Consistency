# Write your MySQL query statement below
SELECT x,y,z,
CASE WHEN x+y <= z THEN 'No'
    WHEN y+z <= x THEN 'No' 
    WHEN z+x <= y THEN 'No' 
    ELSE 'Yes' END as `triangle`
FROM triangle;