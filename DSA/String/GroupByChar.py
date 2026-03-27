def groupByCharacter(strs):
    groups={}
    for s in strs:
        # key=s[0]      # groupByCharacter
        key=tuple(sorted(s))      # groupByAnagram
        # key=len(s)      # groupByLength
        if key not in groups:
            groups[key]=[]
        groups[key].append(s)
    # print(groups)
    # print(groups.keys())
    print(groups.values())

strs=["bat", "ball", "allb", "tab", "ace", "cae", "xyxz", "yzxx"]
groupByCharacter(strs)