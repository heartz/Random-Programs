fil=open("output1.txt","w+")
fil2=open("B-large-practice.in","r")
noOfTestCases=int(fil2.readline())
for i in range(1,noOfTestCases+1):
    wordlist=fil2.readline().split()
    wordlist=wordlist[::-1]
    c=' '.join(wordlist)
    fil.write("Case #"+str(i)+": "+c+'\n')
