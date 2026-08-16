# Write your MySQL query statement below
SELECT  D.name as Department, E.name as Employee , E.salary as Salary
FROM (
    SELECT *,
           MAX(salary) OVER (PARTITION BY departmentId) AS max_salary
    FROM Employee
) E
INNER JOIN department D
    ON E.departmentId = D.id
WHERE E.salary=max_salary;