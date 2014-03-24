fileOpen=open("A-small-practice (2).in","r+")
fileOpen2=open("output6.txt","w+")
a=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ']
b=['y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',' ']
noOfTestCases=int(fileOpen.readline())
for i in range(1,noOfTestCases+1):
    code=fileOpen.readline()
    length=len(code)
    sentence=list(code)
    for j in range(0,length):
        for k in range(0,27):
            if(sentence[j]==a[k]):
                sentence[j]=b[k]
                break
    decode=''.join(sentence)
    fileOpen2.write("Case #")
    fileOpen2.write(str(i))
    fileOpen2.write(": ")
    fileOpen2.write(decode)
    fileOpen2.write('\n')   
    