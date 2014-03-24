fileOpen=open("A-large-practice.in","r+")
fileOpen2=open("output4.txt","w+")
noOfTestCases=int(fileOpen.readline())
for i in range(1,noOfTestCases+1):
    vectorDegree =int(fileOpen.readline())
    lineOne =fileOpen.readline()
    xCoordinates=lineOne.split()
    lineTwo=fileOpen.readline()
    yCoordinates=lineTwo.split()
    totalSum=0;
    xMap=map(int,xCoordinates)
    yMap=map(int,yCoordinates)
    xSorted=sorted(xMap)
    ySorted=sorted(yMap)
    yReversed=ySorted[::-1] #'Least value is after x is sort and y is reverse sorted.
    for j in range(vectorDegree):
        totalSum+=(int(xSorted[j])*(int(yReversed[j])))
    fileOpen2.write("Case #")
    fileOpen2.write(str(i))
    fileOpen2.write(": ")
    fileOpen2.write(str(totalSum))
    fileOpen2.write('\n')