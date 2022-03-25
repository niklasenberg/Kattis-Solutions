def run():
    line = input().split(' ')
    people = int(line[0])
    chickens = int(line[1])

    if chickens >= people:
        if chickens - people == 1:
            grammar = 'piece'
        else:
            grammar = 'pieces'
        print(f'Dr. Chaz will have {chickens - people} {grammar} of chicken left over!')
    else:
        if people - chickens == 1:
            grammar = 'piece'
        else:
            grammar = 'pieces'

        print(f'Dr. Chaz needs {people - chickens} more {grammar} of chicken!')


if __name__ == '__main__':
    run()
