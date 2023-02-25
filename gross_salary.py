s=float(input("enter your salary:"))
m=float(input("enter federal deductions in %:"))
d=float(input("enter state deductions in %:"))
t=float(input("enter company pension plan %:"))
e=float(input("enter the no of weeks that you want to know your salary after deductions:"))
print(f"your salary after {int(e)} weeks:",e*(s-(((m+d+t)/100)*s)))    
        
