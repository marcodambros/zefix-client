# Zefix Client CLI

This is an initial prototype to access Zefix API data, both information about firms and SHA snippets from the registry of commerce.
The prototype was built during the preparation of a proposal for the SNF program NRP 77, with two goals:
- as a proof of concept that Zefix data can be retrieved;
- to investigate which data is available and what is the shape of the data.

In the current initial form, the prototype just retrieves the data from the Zefix API and logs it on standard output and on a logfile, without any storage. If the project will be funded much more will built on top of that.


## Usage

This initial prototype is a CLI, with the following options:

```
usage: zefix-client
 -c,--get-chid <arg>      Get company details for given CH id
 -e,--get-ehra <arg>      Get company details for given EHRA id
 -h,--help                Print this message
 -i,--get-uid <arg>       Get company details for given UID
 -p,--password <arg>      Zefix API password
 -s,--search <arg>        Search company by name
 -t,--publication <arg>   Get the text of the SHAB publication given the SHAB id
```

