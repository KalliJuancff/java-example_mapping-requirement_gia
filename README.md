## [Fake] GIA's requirement:
#### "Each customer must be registered with work phone number and address or mobile phone number"

## But... what does the above mean?
### This is a clear example of an unclear requirement that business team needs to clarify.
### But since we don't have any in our pocket, let's imagine.
### And there are two possible interpretations:
####       1/ (work phone number and address) or mobile phone number?
####       2/ work phone number and (address or mobile phone number)?

## Acceptance criteria (or rules):
### Option 1:
####    WPN ADD MPN
####    [x] [x] [x] -> can be registered
####    [x] [x] [ ] -> can be registered
####    [x] [ ] [x] -> can be registered
####    [x] [ ] [ ] -> cannot be registered
####    [ ] [x] [x] -> can be registered
####    [ ] [x] [ ] -> cannot be registered
####    [ ] [ ] [x] -> can be registered
####    [ ] [ ] [ ] -> cannot be registered

### Option 2:
####    WPN ADD MPN
####    [x] [x] [x] -> can be registered
####    [x] [x] [ ] -> can be registered
####    [x] [ ] [x] -> can be registered
####    [x] [ ] [ ] -> cannot be registered
####    [ ] [x] [x] -> cannot be registered
####    [ ] [x] [ ] -> cannot be registered
####    [ ] [ ] [x] -> cannot be registered
####    [ ] [ ] [ ] -> cannot be registered
