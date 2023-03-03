import time as t
st=t.time()
s=input()
i=0
j=len(s)-1
fr=""
ba=""
front=""
back=""
while(i<j):
    if s[i]!=" ":
        fr=s[i]+fr
    if s[j]!=" ":
        ba=ba+s[j]
    if s[i]==" ":
        front+=fr+" "
        fr=""
    if s[j]==" ":
        back=ba+" "+back
        ba=""
    i+=1
    j-=1
if ba!="":
    back=ba+" "+back
if fr!="":
    front+=fr+" "

en=t.time()
print((en-st)*1000)
print(front+back)
