
fil=open("output1.txt","w+")
fil2=open("B-large-practice.in","r")
noOfTestCases=int(fil2.readline())
for i in range(1,noOfTestCases+1):
    sentence=fil2.readline()
    wordlist=sentence.split()
    wordlist=wordlist[::-1]
    c=' '.join(wordlist)
    fil.write("Case #%d: %s\n"%(i,c))
