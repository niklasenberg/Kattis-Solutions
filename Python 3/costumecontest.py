def run():
    n = int(input())
    costumecount = dict()

    for i in range(n):
        costume = input()
        if costume in costumecount:
            costumecount[costume] += 1
        else:
            costumecount[costume] = 1

    min = 1001
    optimalcostumes = []
    for costume in costumecount:
        count = costumecount[costume]
        if count == min:
            optimalcostumes.append(costume)
        elif count < min:
            min = count
            optimalcostumes.clear()
            optimalcostumes.append(costume)

    optimalcostumes.sort()
    for costume in optimalcostumes:
        print(costume)


if __name__ == '__main__':
    run()
