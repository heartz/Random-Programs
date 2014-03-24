fileOpen=open("A-large-practice(1).in","r+")
fileOpen2=open("output7.txt","w+")
noOfTestCases=int(fileOpen.readline())
for i in range(1,noOfTestCases+1):
    positions=[]
    credit=int(fileOpen.readline())
    noOfItems=int(fileOpen.readline())
    pricesLine=fileOpen.readline()
    pricesTable=pricesLine.split()
    prices=map(int,pricesTable)
    for j in range(0,noOfItems):
        for k in range(j+1,noOfItems):
            if((int(pricesTable[j])+int(pricesTable[k]))==credit):
                positions.append(j+1)
                positions.append(k+1)
    index2=int(positions.pop())
    index1=int(positions.pop())
    indexes=str(index1)+" "+str(index2)
    fileOpen2.write("Case #")
    fileOpen2.write(str(i))
    fileOpen2.write(": ")
    fileOpen2.write(indexes)
    fileOpen2.write('\n')   
    