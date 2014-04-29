fileOpen=open("A-large-practice (2).in","r+")
fileOpen2=open("allurbase.txt","w+")
testCases=int(fileOpen.readline())
for i in range(1,testCases+1):
    inputTime=fileOpen.readline()
    charsOfTime=inputTime.strip()
    k=0
    values=[]
    added=[]
    values.append(1)
    added.append(charsOfTime[0])
    for j in range(1,len(charsOfTime)):
        if charsOfTime[j] not in added:
            values.append(k)
            k=k+1
            if(k==1):
                k=2
            added.append(charsOfTime[j])
        else:
            values.append(values[added.index(charsOfTime[j])])
            added.append(charsOfTime[j])
    values=[int(j) for j in values]
    result = 0
    base = max(k, 2)
    for j in range(0,len(charsOfTime)):
        result *= base
        result += values[j]
    fileOpen2.write('Case #%d: %d\n'%(i,result))
    