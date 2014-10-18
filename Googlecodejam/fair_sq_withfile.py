import math
fileOpen=open("C-large-practice-1.in","r+")
#fileOpen=open("fair-sq-small.in","r+")
#fileOpen=open("testing.txt","r+")
fileOpen2=open("output6.txt","w+")
noOfTestCases=int(fileOpen.readline())
arr=[0,1,2,3,11,22,101,111,121,202,212,1001,1111,2002,10001,10101,10201,11011,11111,11211,20002,20102,100001,101101,110011,111111,200002,1000001,1001001,1002001,1010101,1011101,1012101,1100011,1101011,1102011,1110111,1111111,2000002,2001002]
#array of all fair and sq between 0 to 10^14
for i in range(1,noOfTestCases+1):
    count=0
    j=0
    first=0
    second=0
    limits=fileOpen.readline()
    limits1=limits.split()
    num1=int(limits1[0])
    num2=int(limits1[1])
    j=0
    for j in range(39,-1,-1):
        if(num2 >= (arr[j]**2)):
            break;
    count=0
    n=0
    for n in range(j,-1,-1):
        if((arr[n]**2) >= num1):
           count=count+1
        else:
           break;
    fileOpen2.write("Case #%d: %d\n"%(i,count))
