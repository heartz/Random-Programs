import math
Dictionary.new(0)

fileOpen=open("fair-sq-large1.in","r+")
#fileOpen=open("fair-sq-small.in","r+")
#fileOpen=open("testing.txt","r+")
fileOpen2=open("output6.txt","w+")
noOfTestCases=int(fileOpen.readline())
arr=[0,1,2,3,11,22,101,111,121,202,212,1001,1111,2002,10001,10101,10201,11011,11111,11211,20002,20102,100001,101101,110011,111111,200002,1000001,1001001,1002001,1010101,1011101,1012101,1100011,1101011,1102011,1110111,1111111,2000002,2001002]
def ispalindrome(num):  
    n=str(num)  
    while len(n)>1:  
        if n[0]!=n[-1]:  
            return False  
        n=n[1:-1]  
    return True 
def isSquare(integer):
    root = math.sqrt(integer)
    if int(root + 0.5) ** 2 == integer: 
        return True
    else:
        return False
def checker(num):
    n=num
    num=str(num)
    num=num+"012"
    set1=set(num)
    set2=set("012")

    if((set1==set2)|(n==3)):
        return True
        print(set1,set2)
    else:
        return False
for i in range(1,noOfTestCases+1):
    count=0
    j=0
    first=0
    second=0
    limits=fileOpen.readline()
    limits1=limits.split()
    lowerLimit=int(limits1[0])
    upperLimit=int(limits1[1])
    if(isSquare(lowerLimit)==True):
        sqLowerLimit =int(math.sqrt(lowerLimit))
    else:
        sqLowerLimit =int(math.sqrt(lowerLimit))+1
    sqUpperLimit =int(math.sqrt(upperLimit))
    for j in range(sqLowerLimit,sqUpperLimit+1):
        if(ispalindrome(j)):
            if(checker(j)):
                k=j**2
                if(ispalindrome(k)):
                    first=j
                    #print(i,first)
                    break
    for j in range(sqUpperLimit,sqLowerLimit-1,-1):
        if(ispalindrome(j)):
            if(checker(j)):
                k=j**2
                if(ispalindrome(k)):
                    second=j
                    #print(i,second)
                    break
    count = arr.index(second) - arr.index(first)     
    if(first!=0):
        count=count+1
    print(i)
    fileOpen2.write("Case #%d: %d\n"%(i,count))