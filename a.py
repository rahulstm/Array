a=input("enter string ")
s=a[::-1]
if(a==s):
    t=len(s)

    count=0
    for i in range(1,t+1):
        if(t%i==0):
            count+=1
    if(count==2):
        print("prime length and palindromic")
    else:
        print("not ")
    