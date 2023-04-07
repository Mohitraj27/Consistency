# Write your MySQL query statement below
# Write your MySQL query statement below
select ss.name as Employee from Employee as ss
left join  Employee as ww on ss.managerId = ww.id
where ss.salary > ww.salary
