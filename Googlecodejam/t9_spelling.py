fileOpen=open("C-small-practice(1).in","r+")
fileOpen2=open("output8.txt","w+")
table=['2','22','222','3','33','333','4','44','444','5','55','555','6','66','666','7','77','777','7777','8','88','888','9','99','999','9999','0']
noOfTestCases=int(fileOpen.readline())
for i in range(1,noOfTestCases+1):
    finalOut=""
    inputStatement=fileOpen.readline()
    listOfChar=list(inputStatement)
    lenght=len(inputStatement)
    for j in range(0,lenght-1):
        char1=listOfChar[j]
        asciiValue1=ord(char1)
        char2=listOfChar[j+1]
        asciiValue2=ord(char2)
        if(asciiValue1==32):
            asciiValue1=123
        elif(asciiValue2==32):
            asciiValue2=123
        if((int(table[asciiValue1-97])%10)==(int(table[asciiValue2-97])%10)):
            finalOut=finalOut+(table[asciiValue1-97])
        else:
            finalOut=finalOut+" "+(table[asciiValue1-97])
    if((int(table[asciiValue1-97])%10)==(int(table[asciiValue2-97])%10)):
        finalOut=finalOut+" "+(table[asciiValue2-97])
    else:
        finalOut=finalOut+(table[asciiValue2-97])
    fileOpen2.write("Case #")
    fileOpen2.write(str(i))
    fileOpen2.write(": ")
    fileOpen2.write(finalOut)
    fileOpen2.write('\n')   