import re
fileOpen=open("alien-S.in","r+")
fileOpen2=open("alien-out.txt","w+")
param_list=fileOpen.readline()
splitLine=param_list.split()
lenOfEach=int(splitLine[0])
noOfWords=int(splitLine[1])
noOfTestCases=int(splitLine[2])
words=''
for i in range(noOfWords):
    words+=fileOpen.readline()
for i in range(1,noOfTestCases+1):
    stupidWords=fileOpen.readline().rstrip('\n')
    stupidWords=stupidWords.replace('(','[').replace(')',']')
    allWords=re.findall(stupidWords,words)
    fileOpen2.write('Case #%d: %d\n' %(i,len(allWords)))
