n=int(input('Enter your number'))
sum=0
for num in range(1,n+1,1):
    sum+=num
print('Sum of first',n,'numbers is',sum)
average=sum/n
print("Average of",n,"numbers is:",average)