def run():
    line = input().split()
    p = int(line[0])
    t = int(line[1])

    problemsum = 0
    for i in range(p):
        solvable = True
        for k in range(t):
            problem = input()
            if not problem[1:len(problem)].islower():
                solvable = False

        if solvable:
            problemsum += 1

    print(problemsum)


if __name__ == '__main__':
    run()
