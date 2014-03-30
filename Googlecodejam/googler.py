import math
fileOpen=open("B-large-practice(1).in","r+")
fileOpen2=open("output2.txt","w+")
noOfTestCases=int(fileOpen.readline())
for i in range(1,noOfTestCases+1):
    fullLine=fileOpen.readline()
    splitLine=fullLine.split()
    googlers=int(splitLine[0])
    countSurprise=int(splitLine[1])
    minimumScore=int(splitLine[2])
    scores=[None]*googlers
    passers=0
    for j in range(0,googlers):
        scores[j]=int(splitLine[3+j])
        scoresCheck1=scores[j]-minimumScore
        scoresCheck2=scoresCheck1-(minimumScore-1)
        difference=scoresCheck2-minimumScore
        absDiff=math.fabs(difference)
        if(absDiff==1 or absDiff==0 or difference>0):
            passers=passers+1
        elif((absDiff==3 or absDiff==2) and countSurprise>0 and scoresCheck1>=0):
            countSurprise=countSurprise-1
            passers=passers+1
    fileOpen2.write("Case #%d: %d\n"%(i,passers))
