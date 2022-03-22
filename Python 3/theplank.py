#TODO: Passes 3/5 tests, needs to be more efficient for larger n values

def run():
    n = int(input())
    combinations = set()
    plank = []
    print(establishPlank(n, combinations, plank).__len__())


def establishPlank(n, combinations, plank):
    if n == 0:
        combinations.add(tuple(plank))
        return combinations
    if n >= 1:
        plank.append('1')
        combinations = establishPlank(n-1, combinations, plank)
    if n >= 2:
        plank.append('2')
        combinations = establishPlank(n-2, combinations, plank)
    if n >= 3:
        plank.append('3')
        combinations = establishPlank(n-3, combinations, plank)

    return combinations

if __name__ == '__main__':
    run()
