basic_salary=int(input('Enter your basic salary'))
HRA=int(input('Enter your House Rent Allowance'))
DA=int(input('Enter Daily Allowance'))
if(basic_salary<=1000):
  DA=basic_salary*0.8
  HRA=basic_salary*0.5
  print('House Rent Allowance for basic Salary',basic_salary,'is',HRA,'and Daily Allowance is',DA)
elif(basic_salary>=10001 and basic_salary<=20000):
  DA=basic_salary*0.9
  HRA=basic_salary*0.25
  print('House Rent Allowance for basic Salary',basic_salary,'is',HRA,'and Daily Allowance is',DA)
elif(basic_salary>=20001):
  DA=basic_salary*0.95
  HRA=basic_salary*0.3
  print('House Rent Allowance for basic Salary',basic_salary,'is',HRA,'and Daily Allowance is',DA)
gross_salary=basic_salary+HRA+DA
print('Gross Salary',gross_salary)