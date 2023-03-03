import threading

def reverse_word(word):
    return word[::-1]

def reverse_para_multithread(para):
    chunks = para.split()
    threads = []
    for chunk in chunks:
        t = threading.Thread(target=reverse_word, args=(' '.join(chunk),))
        threads.append(t)
        t.start()
        print(reverse_word(chunk),end=" ")
    for t in threads:
        t.join()
    

paragraph =input("Enter a paragraph:")
reverse_para_multithread(paragraph)
