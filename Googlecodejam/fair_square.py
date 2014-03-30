import math
fileOpen=open("C-large-practice-1.in","r+")
fileOpen2=open("output5.txt","w+")
noOfTestCases=int(fileOpen.readline())
def palindrome(num):
    return num == num[::-1]
def isSquare(integer):
    root = math.sqrt(integer)
    if int(root + 0.5) ** 2 == integer: 
        return True
    else:
        return False

for i in range(1,noOfTestCases+1):
    count=0
    limits=fileOpen.readline()
    limits1=limits.split()
    lowerLimit=int(limits1[0])
    upperLimit=int(limits1[1])
    for j in range(lowerLimit,upperLimit+1):
        if(isSquare(j)==True):
            sq=int(math.sqrt(j))                        
            if((palindrome(str(j))==1)&(palindrome(str(sq))==1)):
                count=count+1
    fileOpen2.write("Case #%d: %d\n"%(i,count))
           
            