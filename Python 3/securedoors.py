def run():
    n = int(input())
    entered = []

    for i in range(n):
        line = input().split()

        if line[0] == 'entry':
            if entered.__contains__(line[1]):
                print(f'{line[1]} entered (ANOMALY)')
            else:
                print(f'{line[1]} entered')
                entered.append(line[1])
        else:
            if entered.__contains__(line[1]):
                print(f'{line[1]} exited')
                entered.remove(line[1])
            else:
                print(f'{line[1]} exited (ANOMALY)')


if __name__ == '__main__':
    run()
