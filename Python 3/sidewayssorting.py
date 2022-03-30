import sys


def run():
    while True:
        line = sys.stdin.readline().split()
        r = int(line[0])
        c = int(line[1])

        if r == 0:
            break

        wordlist = ['' for _ in range(c)]

        for i in range(r):
            word = sys.stdin.readline()
            for k in range(c):
                wordlist[k] += word[k]

        wordlist = sorted(wordlist, key=str.casefold)

        columnlist = ['' for _ in range(r)]

        for i in range(r):
            for k in range(c):
                columnlist[i] += wordlist[k][i]

        for i in columnlist:
                print(i)

        print()


if __name__ == '__main__':
    run()
