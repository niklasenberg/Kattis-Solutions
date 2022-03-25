def run():
    correct = int(input())
    me = list(input())
    friend = list(input())

    index = 0
    possible = 0
    for char in me:
        if friend[index] != char:
            possible += 1
        else:
            if correct > 0:
                possible += 1
                correct -= 1
        index += 1

    print(possible - correct)


if __name__ == '__main__':
    run()
