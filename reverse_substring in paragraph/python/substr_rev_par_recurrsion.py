def rev(k):
    if len(k)==0:
        return k
    else:
        return rev(k[1:]) + k[0]

def rev_para(para):
    z=""
    for i in para:
        if i!=" ":
            z+=i
        else:
            k.append(z)
            print(rev(z)+i,end="")
            z=""
    if z:
        print(rev(z))

p=input()
rev_para(p)









